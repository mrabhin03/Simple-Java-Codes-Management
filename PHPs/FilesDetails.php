<div class="code-main">
<?php
function getJavaFiles($directory, $rootDir = null,$Search) {
    $javaFiles = []; 
    if ($rootDir === null) {
        $rootDir = basename($directory);
    }

    if (is_dir($directory)) {
        $items = scandir($directory);

        foreach ($items as $item) {
            if ($item !== '.' && $item !== '..') {
                $itemPath = $directory . DIRECTORY_SEPARATOR . $item;
                if (is_dir($itemPath)) {
                    $javaFiles = array_merge($javaFiles, getJavaFiles($itemPath, $rootDir,$Search));
                } elseif (is_file($itemPath) && pathinfo($itemPath, PATHINFO_EXTENSION) === 'java' && stripos(basename($itemPath), $Search) === 0)
                {
                    $relativePath = str_replace('../','',$itemPath);
                    $Type=explode('\\',$itemPath);
                    $javaFiles[] = [
                        'FileName' => $item,
                        'RootDirectory' => $Type[count($Type)-2],
                        'FullPath' => $relativePath
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
            $Dir = "\\" . str_replace('/', "\\", $_GET['Dir']);
        }else{
            $Dir='';
        }
    }
    $Search=$_GET['Search'];
    $folderPath = '..'.$Dir; 
    $AllFiles=[];
    if (is_dir($folderPath)) {
        $items = scandir($folderPath);
        foreach ($items as $item) {
            $javaFiles=[];
            $itemPath = $folderPath . DIRECTORY_SEPARATOR . $item;
            echo $item."<br>";
            if (is_file($itemPath) && pathinfo($itemPath, PATHINFO_EXTENSION) === 'java' && stripos(basename($itemPath), $Search) === 0) {
                $relativePath = str_replace('../','',$itemPath);
                $Type=explode('\\',$itemPath);
                $Cret=explode('\\',$relativePath);
                $AllFiles[]=[
                    'FileName'=>$item,
                    'Type'=>$Type[count($Type)-2],
                    'Path'=>$relativePath,
                    'Creator'=>$Cret[1]
                ];
            }else{
                if ($item !== '.' && $item !== '..' && is_dir($itemPath) && $item[0] !== '.' && $item!='PHPs') {
                    $directory = $folderPath."\\".$item; 
                    $javaFiles = getJavaFiles($directory,null,$Search);
                    foreach ($javaFiles as $file) {
                        $Cret=explode('\\',$file['FullPath']);
                        $AllFiles[]=[
                            'FileName'=>$file['FileName'],
                            'Type'=>$file['RootDirectory'],
                            'Path'=>$file['FullPath'],
                            'Creator'=>$Cret[1]
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
                                        
    ?>
    <div class="card h-100">
        <img class="card-img-top" style='height:100px; width:100px; margin:5px auto; margin-top:15px;' src="assets/java.png" alt="..." />
        <div class="card-body p-4">
            <div class="text-center">
            <h5 class="fw-bolder"  style='font-size:20px;'><?php $file1=str_replace('.java','',$file['FileName']); echo $file1;?></h5>
                <span style='font-size:15px;'>Type: <?php echo $file['Type'] ?><br>
                Creator: <?php echo $file['Creator'] ?></span>
            </div>
        </div>
        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
            <div class="text-center"><a class="btn btn-outline-dark mt-auto" style='background-color:white;' href="CodeView.php?FileDetails=<?php echo $file['Path'] ?>">View options</a></div>
        </div>
    </div>
    <?php
            }
        }
    }
    ?>
                        
</div>