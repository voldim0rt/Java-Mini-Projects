let userScore = 0;
let compScore = 0;

const choices = document.querySelectorAll(".choice");
const msg = document.querySelector("#msg");


const userScorePara = document.querySelector("#user-score");
const CompScorePara = document.querySelector("#comp-score");


const genComputerChoice = () => {
    const options = ["rock", "paper", "scissors"]
    const ranIdx = Math.floor(Math.random() *3);
    return options[ranIdx];
}

const drawGame = () => {
    msg.innerText = "Draw! Play again."
    msg.style.backgroundColor = "grey"
}

const showWinner = (userWin, userChoice, compChoice) => {
    if(userWin) {
        userScore++;
        userScorePara.innerText = userScore;
        msg.innerText = `You Win! Your ${userChoice} beats ${compChoice}`
        msg.style.backgroundColor = "green"
    }else {
        compScore++;
        CompScorePara.innerText = compScore;
        msg.innerText = `You Lose! ${compChoice} beats your ${userChoice}`
        msg.style.backgroundColor = "red"
    }
};

const playgame = (userChoice) =>{
    const compChoice = genComputerChoice();
     
    if(userChoice === compChoice) {
        //draw
        drawGame();

    } else {
        let userWin = true;
        if (userChoice === "rock") {
            //scissors, paper
            userWin = compChoice === "paper" ? false : true; 
        } else if (compChoice === "paper") {
            //rock,scissors
            userWin = compChoice === "scissors" ? false : true;

        } else{
            //paper, rock
            userWin = compChoice === "rock" ? false : true; 
        }   
        showWinner(userWin, userChoice, compChoice);
    }
};

choices.forEach((choice)=> {
    choice.addEventListener("click", ()=> {
        const userChoice = choice.getAttribute("id");    
        playgame(userChoice);
    })
})