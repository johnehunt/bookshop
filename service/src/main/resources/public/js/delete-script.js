$(document).ready(function() {
  console.log('Setting up delete form');
  $("#delete-form").submit(function(event) {
    event.preventDefault();
    let isbn = $("#isbn").val();
    let ok = confirm('Are you sure you want to delete the book with ISBN: ' + isbn);
    console.log('ok:', ok);
    if (ok) {
        let url = "http://localhost:8080/bookshop/" + isbn;
        console.log('Invoking: ' + url);

        // Using long hand form - some browsers don't support short hand version
        $.ajax({
            type : "DELETE",
            url : url,
            success: function (result) {
                   console.log(result);
                   alert('Book Deleted by ISBN');
            },
            error: function (e) {
                console.log(e);
                alert('Something wetn wrong');
            }
        });

//        $.delete(url, function(result) {
//            console.log('In post callback function - ' + result);
//            alert('Book Deleted by ISBN');
//        });
     }
  });
});