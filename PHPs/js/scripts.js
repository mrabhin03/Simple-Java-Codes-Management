var MainOption='';

function GetData(Dir,Search) {
    DetailsContainer = document.getElementById("JavaCodes");
    var xhr = new XMLHttpRequest();
    xhr.open("GET", "FilesDetails.php?Dir=" + Dir+"&Search="+Search, true);
    xhr.onload = function () {
        if (xhr.status >= 200 && xhr.status < 300) {
            DetailsContainer.innerHTML = xhr.responseText;
        } else {
            console.error("Error:", xhr.statusText);
        }
    };
    xhr.onerror = function () {
    console.error("Network Error");
  };
  xhr.send();
}
GetData(MainOption,'')

document.getElementById('SearchDataInput').addEventListener('input', function() {
    GetData(MainOption,this.value)
});


function selectOption(object,Path){
    NavLinks=document.querySelectorAll(".nav-link");
    NavLinks.forEach(NavLink => {
        NavLink.classList.remove('active');
    });
    if(!object.classList.contains('nav-link')){
        object.querySelector(".nav-link").classList.add('active');
    }else{
        object.classList.add('active');
    }
    MainOption=Path;
    document.getElementById('SearchDataInput').value='';
    GetData(MainOption,'')
    
}

