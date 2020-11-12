const url = "https://gentle-chamber-40438.herokuapp.com";

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

const makeCards = (result) => {
  let element = document.getElementById("test");
  result.forEach((user) => {
    let card = document.createElement("DIV");
    let cardHTML = document.createTextNode(
      user.firstName + " " + user.lastName + ": " + user.state
    );
    card.appendChild(cardHTML);
    element.appendChild(card);
  });
};
