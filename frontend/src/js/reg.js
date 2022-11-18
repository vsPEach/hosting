

let radio = Array.from(document.querySelectorAll(".role"));
let label = document.querySelector(".form__radio__label");
const form = document.querySelector('.form');

console.log(radio);


radio.forEach((item) => {
    item.addEventListener('change', (e) => {
        e.preventDefault();
        if (item.value === 'student') {
            label.textContent = 'Ваша группа';
        } else {
            label.textContent = 'Ваш предмет';
        }
    })
})

let submit = document.querySelectorAll(".send_btn")

submit.onsubmit = function(e) { 
    e.preventDefault();
}


function CreateUser() {

    let xhr = new XMLHttpRequest()
    xhr.open(
        'post',
        'http://localhost:8080/register', 
        true
    )

    let data = JSON.stringify({ 
        fullname: "example",
        email: "example.com",
        password: "password",
        date: new Date(),
        isTeacher: true,
        subject: "Math"
    })

    xhr.setRequestHeader('Content-Type', 'application/json')
    xhr.send(data)
    xhr.onreadystatechange = (e) => {
        console.log(xhr.responseText)
    }
}