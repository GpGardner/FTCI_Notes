let map;
let marker;
// let coords = { lat: 35.227085, lng: -80.843124 };
let contentString = "<h2>" + city + ", " + state + "</h2>";

function initMap() {
  console.log(google);

  let infowindow = new google.maps.InfoWindow({
    content: contentString,
  });

  let image = {
    url:
      "https://developers.google.com/maps/documentation/javascript/examples/full/images/beachflag.png",
  };

  map = new google.maps.Map(document.getElementById("map"), {
    center: coords,
    zoom: 10,
    scrollwheel: false,
  });

  marker = new google.maps.Marker({
    position: coords,
    map: map,
    icon: image,
    animation: google.maps.Animation.DROP,
  });

  google.maps.event.addListener(marker, "click", function () {
    infowindow.open(map, marker);
  });
}
