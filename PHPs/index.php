<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <a href="index.html">Test GooGle</a><br>
<?php
$directory = '../Anu'; 

$files = scandir($directory);

foreach ($files as $file) {
    if ($file !== '.' && $file !== '..') {
        if (pathinfo($file, PATHINFO_EXTENSION) === 'java') {
            echo $file . "<br>";
        }
    }
}
?>

</body>
</html>