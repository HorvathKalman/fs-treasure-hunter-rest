window.onload = function() {

    let squareGetElement = document.getElementById("squareGet");
    squareGetElement.onclick = sendGetRestRequest;

    let squarePostElement = document.getElementById("squarePost");
    squarePostElement.onclick = sendPostRestRequest;
}


function sendGetRestRequest() {
    
    fetch("http://localhost:8080/user/99")
        .then(
            response => {
                if(!response.ok) {
                    alert("Hiba tortent");
                } else {
                    return response.json();
                }
            }
        )
        .then(
            data => {
                console.log(data)
                let userNameElement = document.getElementById("userName");
                userNameElement.innerHTML = data.name;

                let gameTableElement = document.getElementById("gameTable");
                gameTableElement.style.display = "block";
            }
        )
}


function sendPostRestRequest() {

    let userRequestBody = {
        name: "My Test Request",
        win: true
    }

    fetch(
        "http://localhost:8080/user/save",
        {
            method: "POST",
            headers: {
                'Content-type': 'application/json'
            },
            body: JSON.stringify(userRequestBody)
        }
    )
    .then(
        response => {
            if(!response.ok) {
                alert("Hiba tortent");
            } else {
                return response.json();
            }
        }
    )
    .then(
        data => {
            console.log(data)
        }
    ) 

}