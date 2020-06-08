$(document).ready(function() {
  console.log('Setting up query form');
  $("#query-form").submit(function(event) {
    let url = "http://localhost:8080/bookshop/" + $("#isbn").val();
    console.log('Invoking: ' + url);
    $.get(url, function(book) {
       console.log('In post callback function - ', book);
       $("#book").empty();
       let html = "<h3 class='title'>" + book.title + "</h3>";
       html += "<ul>"
       html += "<li>Author: " + book.author + "</li>";
       html += "<li>price: " + book.price + "</li>";
       html += "<li>isbn: " + book.isbn + "</li>";
       html += "</ul>"
       $("#book").append($(html));
     });
    event.preventDefault();
  });
});