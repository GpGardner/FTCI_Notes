const url = "http://localhost:8080/api/posts";
const postsDiv = document.getElementById("posts");

function getAllBlogPosts() {
  axios
    .get(url)
    .then(function (response) {
      data = response.data;
      createBlogPostView(data);
    })
    .catch(function (error) {
      console.log(error);
    });
}

function deleteBlogPost(){
	
}

function createBlogPostView(blogPosts) {
  blogPosts.forEach((blogPost) => {
    let imgElement = document.createElement("img");
    imgElement.src = blogPost.image;

    let title = document.createTextNode(blogPost.title);
    let titleElement = document.createElement("h5");
    titleElement.classList.add("card-title");
    titleElement.appendChild(title);

    let author = document.createTextNode(blogPost.author);
    let authorElement = document.createElement("div");
    authorElement.classList.add("card-subtitle");
    authorElement.classList.add("mb-2");
    authorElement.classList.add("text-muted");
    authorElement.appendChild(author);

    let blogEntry = document.createTextNode(blogPost.blogEntry);
    let blogEntryElement = document.createElement("div");
    blogEntryElement.classList.add("card-body");
    blogEntryElement.appendChild(blogEntry);

    let cardElement = document.createElement("div");
    cardElement.classList.add("card");

    let cardBodyElement = document.createElement("div");
    cardBodyElement.classList.add("card-body");

    cardBodyElement.appendChild(titleElement);
    cardBodyElement.appendChild(authorElement);
    cardBodyElement.appendChild(blogEntryElement);

    cardElement.appendChild(imgElement);
    cardElement.appendChild(cardBodyElement);
    cardElement.classList.add("mt-5");

    postsDiv.appendChild(cardElement);
  });
}
