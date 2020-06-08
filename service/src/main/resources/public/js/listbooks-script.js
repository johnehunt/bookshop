$(document).ready(function() {
  $("#show").hover(
    function() {
      $(this).addClass("hover");
    },
    function() {
      $(this).removeClass("hover");
    }
  );
  $("#show").click(function() {
    console.log("running click on show");
    event.preventDefault();
    $.get("http://localhost:8080/bookshop/list", function(books) {
          $("#booklist").empty();
          let html = "<div class='book'>";
          $.each(books, function(i, book) {
              console.log(book);
              html += "<h3 class='title'>" + book.title + "</h3>";
              html += "<ul>"
              html += "<li>Author: " + book.author + "</li>";
              html += "<li>price: " + book.price + "</li>";
              html += "<li>isbn: " + book.isbn + "</li>";
              html += "</ul>"
            });
            html += "</div>";
            $("#booklist").append($(html));
      });
    });
  });
