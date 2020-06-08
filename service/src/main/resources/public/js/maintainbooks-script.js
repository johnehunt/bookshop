$(document).ready(function() {
  console.log('Setting up maintain form');
  $("#maintain-form").submit(function(event) {
      // Stop form from submitting normally
      event.preventDefault();

      console.log(event)
      let url = "http://localhost:8080/bookshop";

      let obj = $(this).serializeJSON();
      let data = JSON.stringify(obj);
      console.log(data)

      $.ajax({
        type: "POST",
        url: url,
        data: data,
        success: function(result) {
            console.log(result);
            alert('Books Updated');
        },
        failure: function(errMsg) {
           alert(errMsg);
        },
        contentType: "application/json; charset=utf-8",
        dataType: "json"
      });

  });
});