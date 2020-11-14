const url = "https://gentle-chamber-40438.herokuapp.com";

//REQUEST TO API - API WE MADE IN CLASS
const makeGetRequest = () => {
  console.log(url + "/users");
  axios.get(url + "/users").then(
    (response) => {
      let result = response.data;
      makeCards(result);
    },
    (error) => {
      console.log(error);
    }
  );
};

const makePostRequest = () => {
  const firstName = document.getElementById("formFirstName").value;
  const lastName = document.getElementById("formLastName").value;
  const state = document.getElementById("formState").value;

  const userObj = {
    firstName,
    lastName,
    state,
  };

  axios
    .post(url + "/users", userObj)
    .then(function (response) {
      console.log(response);
    })
    .catch(function (error) {
      console.log(error);
    });
};

//TESTING DATA, USED IF WORKING OFFLINE
const testingCards = () => {
  let userData = [
    {
      firstName: "Bob",
      lastName: "Builder",
      state: "North Carolina",
    },
    {
      firstName: "Clint",
      lastName: "Arnolds",
      state: "North Carolina",
    },
    {
      firstName: "Blue",
      lastName: "Steele",
      state: "Pennsylvania",
    },
    {
      firstName: "Bull",
      lastName: "Hampton",
      state: "Ohio",
    },
    {
      firstName: "Stacy",
      lastName: "Hampton",
      state: "California",
    },
    {
      firstName: "Gwenifer",
      lastName: "OrangeFelter",
      state: "California",
    },
    {
      firstName: "Bucky",
      lastName: "Houstonston",
      state: "California",
    },
  ];
  makeCards(userData);
};

//FUNCTION TO CREATE CARDS FOR WHICHEVER USERS GET PASSED IN
const makeCards = (users) => {
  //GET REFERENCE TO ELEMENT IN HTML
  let element = document.getElementById("test");
  //ARRAY LIST TO HOLD STATES THAT HAVE BEEN MADE ALREADY
  let listOfStatesAlreadyCreated = [];

  //LOOP OVER USERS FROM ABOVE, EACH USER WILL BE ITERADED OVER
  users.forEach((user) => {
    //CHECK THE ARRAYLIST IF IT HAS ALREADY CREATED A CARD FOR A STATE
    if (listOfStatesAlreadyCreated.includes(user.state)) {
      addUserToCard(user);
    } else {
      //ADD THE CURRENT STATE TO THE LIST, THEN CREATE A CARD
      listOfStatesAlreadyCreated.push(user.state);
      createNewCardForState(user, element);
    }
  });
};

//LOGIC TO CREATE A WHOLE NEW CARD FOR A STATE THAT HASN'T BEEN CREATED YET
const createNewCardForState = (user, element) => {
  let card, cardHeader, cardBody, cardState, cardName;
  card = document.createElement("DIV");
  cardHeader = document.createElement("DIV");
  cardBody = document.createElement("DIV");
  cardBodyList = document.createElement("LI");
  cardState = document.createTextNode(user.state);
  cardName = document.createTextNode(user.firstName + " " + user.lastName);

  cardHeader.appendChild(cardState);
  cardHeader.classList.add("card-header");

  cardBody.appendChild(cardBodyList);
  cardBodyList.appendChild(cardName);
  cardBody.classList.add("card-body");
  cardBody.id = user.state;

  card.appendChild(cardHeader);
  card.appendChild(cardBody);
  card.classList.add("card", "mt-3");

  element.appendChild(card);
};

//LOGIC FOR ADDING A USER TO AN EXISTING STATE CARD
const addUserToCard = (user) => {
  let card, cardName, cardBodyList;
  card = document.getElementById(user.state);
  cardBodyList = document.createElement("LI");
  cardName = document.createTextNode(user.firstName + " " + user.lastName);
  cardBodyList.appendChild(cardName);
  card.appendChild(cardBodyList);
};
