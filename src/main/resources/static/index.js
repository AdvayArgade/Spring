async function init(){
    try{
        const response = await axios.get("http://localhost:8080/api/marks/");
    if(response.status===200){
        const tableBody = document.getElementById("tBody");

        response.data.forEach(subject => {
            const row = document.createElement("tr");
            row.innerHTML=`
                <th scope="row">${subject.subjectNum}</th>
                <td>${subject.subjectName}</td>
                <td>${subject.mseMarks}</td>
                <td>${subject.eseMarks}</td>
            `;

            tableBody.appendChild(row);

        });
    }
        else{
            console.log("Error, in try block");
        }
    }
    catch(err){
        console.log("Error and in catch block");
    }
}

init();