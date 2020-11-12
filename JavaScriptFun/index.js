const url = "https://gentle-chamber-40438.herokuapp.com";

// axios.get(url + "/users").then(response => console.log(response.data[0]));

function makeGetRequest() {
  console.log(url + "/users");
  axios.get(url + "/users").then(
    (response) => {
      let result = response.data;
      console.log(result);
      document.getElementById("test").innerHTML = result[0].firstName;
    },
    (error) => {
      console.log(error);
    }
  );
}
