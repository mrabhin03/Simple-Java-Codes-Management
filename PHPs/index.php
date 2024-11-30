<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Java Management</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/java.png" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css?v=<?php echo time()?>" rel="stylesheet" />
    </head>
    <body>
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container px-4 px-lg-5">
                <a class="navbar-brand" href="#!">Java Management</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                        <li class="nav-item"><a class="nav-link active" aria-current="page" onclick='selectOption(this,"")'>All</a></li>
                        <?php
                            $folderPath = '../';
                            if (is_dir($folderPath)) {
                                $items = scandir($folderPath);
                                foreach ($items as $item) {
                                    $itemPath = $folderPath . DIRECTORY_SEPARATOR . $item;
                                    if ($item !== '.' && $item !== '..' && is_dir($itemPath) && $item[0] !== '.' && $item!='PHPs') {
                                        ?>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false"><?php echo $item;?>'s Programs</a>
                                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                            <li><a class="dropdown-item" onclick="selectOption(this.parentNode.parentNode.parentNode,'<?php echo $item;?>')">All</a></li>
                                            <?php
                                                $SubfolderPath = "../$item";
                                                if (is_dir($SubfolderPath)) {
                                                    $newitems = scandir($SubfolderPath);
                                                    foreach ($newitems as $Subitem) {
                                                        $itemPath = $SubfolderPath . DIRECTORY_SEPARATOR . $Subitem;
                                                        if ($Subitem !== '.' && $Subitem !== '..' && is_dir($itemPath) && $Subitem[0] !== '.' && $Subitem!='PHPs') {
                                                            ?>
                                                            <li><a class="dropdown-item" onclick='selectOption(this.parentNode.parentNode.parentNode,"<?php echo $item;?>/<?php echo $Subitem;?>")'><?php echo $Subitem;?></a></li>
                                                            <?php
                                                        }
                                                    }
                                                } else {
                                                    echo "The specified folder does not exist.";
                                                }
                                            ?>
                                            
                                            <!-- <li><a class="dropdown-item" onclick="selectOption(this.parentNode.parentNode.parentNode)">Files</a></li> -->
                                        </ul>
                                    </li>
                                        <?php
                                    }
                                }
                            } else {
                                echo "The specified folder does not exist.";
                            }
                        ?>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- Header-->
        <header class="bg-dark py-5">
            <div class="container px-4 px-lg-5 my-5">
                <div class="text-center text-white">
                    <h1 class="display-4 fw-bolder">Java Code Management</h1>
                    <p class="lead fw-normal text-white-50 mb-0">Repository  for Java Code</p>
                    <input type="text" id='SearchDataInput' class="SearchData" placeholder='Search Java File' onkeydown='ReadSerch(this)'>
                </div>
                
            </div>
        </header>
        <!-- Section-->
        <section class="" style='flex-grow:1;' >
            <div class="container px-4 px-lg-5 mt-5"  id='JavaCodes'>
                
            </div>
        </section>
        <!-- Footer-->
        <footer class="py-5 bg-dark" style='margin-top:20px'>
            <div class="container"><p class="m-0 text-center text-white">This Website is a Prototype <br> <b>'Java Code Reviewer'</b> <a target='_blank' href="https://github.com/mrabhin03">By Abhin M</a></p></div>
        </footer>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js?v=<?php echo time()?>"></script>
    </body>
</html>
