let submit = document.querySelectorAll(".form-block__fields__submit-btn")

submit.onsubmit = function(e) { 
    e.preventDefault();
}

let data = JSON.stringify(
{
    email: "example",
    password: "example.pas",
    date: new Date(),
    isTeacher: false
}) 

var xhr = new XMLHttpRequest()
xhr.open('post', 'http://localhost:8080/login', true)
xhr.setRequestHeader('Content-Type', 'application/json')
xhr.send(data)
xhr.onreadystatechange = (e) => {
    console.log(xhr.responseText)
}

