<div class="code-main">
<?php
function getJavaFiles($directory, $rootDir = null,$Search) {
    $javaFiles = []; 
    if ($rootDir === null) {
        $rootDir = basename($directory);
    }

    if (is_dir($directory)) {
        $items = scandir($directory);
        $items = array_filter($items, function ($item) use ($directory) {
            return $item !== '.' && $item !== '..';
        });
    
        usort($items, function ($a, $b) use ($directory) {
            $aTime = filemtime($directory . DIRECTORY_SEPARATOR . $a);
            $bTime = filemtime($directory . DIRECTORY_SEPARATOR . $b);
            return $bTime <=> $aTime;
        });
        foreach ($items as $item) {
            // echo $item."<br>";
            if ($item !== '.' && $item !== '..') {
                $itemPath = $directory . DIRECTORY_SEPARATOR . $item;
                if (is_dir($itemPath)) {
                    $javaFiles = array_merge($javaFiles, getJavaFiles($itemPath, $rootDir,$Search));
                } elseif (is_file($itemPath) && pathinfo($itemPath, PATHINFO_EXTENSION) === 'java' && stripos(basename($itemPath), $Search) === 0)
                {
                    $relativePath = str_replace('../','',$itemPath);
                    $relativePath = str_replace('\\','/',$relativePath);
                    $Type=explode('/',$relativePath);
                    $javaFiles[] = [
                        'FileName' => $item,
                        'RootDirectory' => $Type[count($Type)-2],
                        'FullPath' => $relativePath,
                        'DateTime'=>date('Y-m-d H:i:s', filemtime($itemPath))
                    ];
                }
            }
        }
    }

    return $javaFiles;
}
?>
    <?php
    if(!isset($_GET['Dir'])){
        $Dir='';
    }else{
        if($_GET['Dir']!=''){
            $Dir = "/" . str_replace('/', "/", $_GET['Dir']);
        }else{
            $Dir='';
        }
    }
    $Search=$_GET['Search'];
    $folderPath = '..'.$Dir; 
    $AllFiles=[];
    if (is_dir($folderPath)) {
        $items = scandir($folderPath);
        $items = array_filter($items, function ($item) use ($folderPath) {
            return $item !== '.' && $item !== '..';
        });
    
        usort($items, function ($a, $b) use ($folderPath) {
            $aTime = filemtime($folderPath . DIRECTORY_SEPARATOR . $a);
            $bTime = filemtime($folderPath . DIRECTORY_SEPARATOR . $b);
            return $bTime <=> $aTime;
        });
        foreach ($items as $item) {
            $javaFiles=[];
            $itemPath = $folderPath . DIRECTORY_SEPARATOR . $item;
            if (is_file($itemPath) && pathinfo($itemPath, PATHINFO_EXTENSION) === 'java' && stripos(basename($itemPath), $Search) === 0) {
                $relativePath = str_replace('../','',$itemPath);
                $relativePath=str_replace('\\','/',$relativePath);
                $MainTemp=explode('/',$relativePath);
                $AllFiles[]=[
                    'FileName'=>$item,
                    'Type'=>$MainTemp[count($MainTemp)-2],
                    'Path'=>$relativePath,
                    'Creator'=>$MainTemp[0],
                    'DateTime'=>date('Y-m-d H:i:s', filemtime($itemPath))
                ];
            }else{
                if ($item !== '.' && $item !== '..' && is_dir($itemPath) && $item[0] !== '.' && $item!='PHPs') {
                    $directory = $folderPath."/".$item; 
                    $javaFiles = getJavaFiles($directory,null,$Search);
                    foreach ($javaFiles as $file) {
                        $T=str_replace('\\','/',$file['FullPath']);
                        $Cret=explode('/',$T);
                        $AllFiles[]=[
                            'FileName'=>$file['FileName'],
                            'Type'=>$file['RootDirectory'],
                            'Path'=>$T,
                            'Creator'=>$Cret[0],
                            'DateTime'=>$file['DateTime']
                        ];
                    }
                }
            }
        }
    } else {
        echo "The specified folder does not exist.";
    }
    ?>


    <?php 
        if(count($AllFiles)==0){
            echo "<div style='grid-column: span 4;font-size:20px;text-align:center;color:white;'>No File Found</div>";
            die();
        }
        foreach ($AllFiles as $file) {
            if ($file['FileName'] !== '.' && $file['FileName'] !== '..') {
                if (pathinfo($file['FileName'], PATHINFO_EXTENSION) === 'java') {
                    $FilePath= base64_encode($file['Path']);
                    $timestamp = strtotime($file['DateTime']);
                    $today = date('Y-m-d');
                    $yesterday = date('Y-m-d', strtotime('yesterday'));
                    $fileDate = date('Y-m-d', $timestamp);
                    $Latest=false;
                    if ($fileDate === $today) {
                        $Latest=true;
                    } elseif ($fileDate === $yesterday) {
                        $Latest=true;
                    }
                                        
    ?>
    <div class="card h-100">
        <!-- <img class="card-img-top" style='height:100px; width:100px; margin:5px auto; margin-top:15px;' src="assets/java.png" alt="..." /> -->
        <div class="card-body p-4">
            <div class="text-center">
                <?php if($Latest){?>
            <span style='padding:3px 5px;background-color:red; border-radius:4px; font-size:12px;'>New</span>
            <?php } ?>
            <h5 class="fw-bolder"  style='font-size:20px;margin-top:10px;'><?php $file1=str_replace('.java','',$file['FileName']); echo $file1;?></h5>
                <span style='font-size:15px; color:#cfcfcf;'>
                    Type: <?php echo $file['Type'] ?><br>
                    Creator: <b><?php echo $file['Creator'] ?></b><br>
                    <?php  echo date('Y-m-d', $timestamp); ?><br>
            </span>
            </div>
        </div>
        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
            <div class="text-center"><a class="btn btn-outline-dark mt-auto" style='background-color:white;' onclick='ResetValue()' target='_blank' href="CodeView.php?VGhpcyBpcyBzZW5zaXRpdmUgZGF0YQ=<?php echo $FilePath ?>">View Code</a></div>
        </div>
    </div>
    <?php
            }
        }
    }
    ?>
                        
</div>