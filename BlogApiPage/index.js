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
      location.reload();
    },
    (error) => {
      console.log(error);
    }
  );
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

  console.log(blogPost);
  axios
    .post(url, blogPost)
    .then(function (response) {
      console.log(response);
      location.reload();
    })
    .catch(function (error) {
      console.log(error);
    });
};

function createBlogPostView(blogPosts) {
  blogPosts.forEach((blogPost) => {
    let cardBodyElement = document.createElement("div");
    cardBodyElement.innerHTML = `<div class="card mt-5 col-4" style="max-width: 18rem;">
		<img class="card-img-top" src="${blogPost.image}" alt="Card image cap">
		<div class="card-body">
			<h5 class="card-title">${blogPost.title}</h5>
			<p class="card-text">${blogPost.blogEntry}</p>
			<div class="btn btn-danger mt-1" onclick="deleteBlogPost(${blogPost.id})">Delete</div>
		</div>
	</div>`;

    postsDiv.appendChild(cardBodyElement);
  });
}

getAllBlogPosts();
