
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Java Code</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/themes/prism-tomorrow.min.css" rel="stylesheet">
  <script src="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/prism.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/prism/1.29.0/components/prism-javascript.min.js"></script>
  <?php
    if(!isset($_GET['VGhpcyBpcyBzZW5zaXRpdmUgZGF0YQ'])){
      die('No Data Found');
    }
    $decryptedData = base64_decode($_GET['VGhpcyBpcyBzZW5zaXRpdmUgZGF0YQ']);
    $filePath="../".$decryptedData;
    $fileContent = file_get_contents($filePath);
    if ($fileContent === false) {
        die("Error reading the file!");
    }
    $fileName = basename($filePath);

  ?>
    <style>
        body {
          user-select: none;
            font-family: Arial, sans-serif;
            background-color:#232323;
            margin: 0;
            padding: 0px 20px;
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        ::-webkit-scrollbar{
            width: 0px;
        }
        h1 {
            color: white;
            margin: 15px 0px;
            font-size: 25px;
        }
        form {
            background-color: #333;
            border-radius: 8px;
            padding: 15px;
            padding-bottom: 0;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
            max-width: 700px;
            width: 100%;
            display: flex;
            flex-direction: column;
            align-items: center;
            gap: 10px;
        }
        .language-javascript{
            user-select: none;
            border-radius:20px !important;
            color:#ddd;
            padding: 0px;
            margin: 0px;
            height:75vh;
            transition: border-color 0.3s ease;
            display: block;
            margin: 0px 0;
            width: 98%;
            cursor: pointer;

        }
        textarea:focus {
            border-color: #3498db;
            outline: none;
        }
        button {
            background-color: #3498db;
            color: white;
            border: none;
            border-radius: 4px;
            padding: 10px;
            cursor: pointer;
            font-size:14px;
            transition: background-color 0.3s ease;
        }
        button:hover {
            background-color: #2980b9;
        }
        #copies{
            font-size:14px;
        }
        button>b{
            font-weight:100;
        }
        #header-details{
          width:100%; 
          display:flex; 
          align-items:center; 
          justify-content:space-between;
        }
        #header-details a{
          color:white;
        }
        #inputBox{
           height: fit-content;
           font-size: 15px;
        }
        @media (max-width:550px) {
          #inputBox{
            font-size: 11px;
          }
          h1 {
            font-size: 18px;
          }
          .language-javascript{
            height:77vh;
          }
        }
    </style>
</head>
<body>
    <h1><?php echo $fileName;?></h1>
    <form  method="post">
        <div id="header-details">
          <button type="button" onclick="copyText()"><ion-icon id="copies" name="copy-outline"></ion-icon> <b id="Copied">Copy</b> </button>
        </div>
        <pre ondblclick="copyText()"><code class="language-javascript" id="inputBox" ></code></pre>        
    </form>
    <script>
        const copies = document.getElementById("copies");
        const Copied=document.getElementById("Copied");
        function copyText() {
            navigator.clipboard.writeText(code[0]);
            copies.name="checkmark-outline";
            Copied.innerHTML="Copied!"
            setTimeout(backToCopy, 2000);
        }
        function backToCopy(){
            copies.name="copy-outline";
            Copied.innerHTML="Copy"
        }


        code=[];
        code.push(`<?php echo $fileContent;?>`);
        function getCodes(){
          const inputBox = document.getElementById("inputBox").innerHTML=code[0];
        }
        getCodes();
    </script>
    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</body>
</html>