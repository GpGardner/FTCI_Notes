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

function deleteBlogPost(id) {
  console.log(id);

  axios.delete(`${url}/${id}`).then(
    (response) => {
      console.log(response);
    },
    (error) => {
      console.log(error);
    }
  );

  location.reload();
}

const makePostRequest = () => {
  const image = document.getElementById("formImage").value;
  const author = document.getElementById("formAuthor").value;
  const title = document.getElementById("formTitle").value;
  const blogEntry = document.getElementById("formBlogEntry").value;

  const blogPost = {
    image,
    author,
    title,
    blogEntry,
  };

	console.log(blogPost)
  axios
    .post(url, blogPost)
    .then(function (response) {
      console.log(response);
    })
    .catch(function (error) {
      console.log(error);
    });
};

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

    let deleteButtonElement = document.createElement("button");
    deleteButtonElement.innerHTML = `<button class="btn btn-danager" onclick="deleteBlogPost(${blogPost.id})"/>`;

    let cardElement = document.createElement("div");
    cardElement.classList.add("card");

    let cardBodyElement = document.createElement("div");
    cardBodyElement.classList.add("card-body");

    cardBodyElement.appendChild(titleElement);
    cardBodyElement.appendChild(authorElement);
    cardBodyElement.appendChild(blogEntryElement);

    cardElement.appendChild(imgElement);
    cardElement.appendChild(cardBodyElement);
    cardBodyElement.appendChild(deleteButtonElement);
    cardElement.classList.add("mt-5");

    postsDiv.appendChild(cardElement);
  });
}

getAllBlogPosts();
