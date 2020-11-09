let map;

function initMap() {
	map = new google.maps.Map(document.getElementById("map"), {
		center: { lat: 35.227085, lng: -80.843124 },
		zoom: 10,
	});
}