<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<head>
    <title>MapStruct</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js" integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0" crossorigin="anonymous"></script></head>
<body>
<div class="container">

    <h1 class="font-weight-bold text-center text-lg-left mt-4 mb-0">MapStruct Demo</h1>
    <hr class="mt-2 mb-5">

    <div class="row text-center">

        <div class="accordion" id="accordionExample">

            <div class="accordion-item">
                <h2 class="accordion-header" id="headingFour">
                    <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
                        <h4>Introduction</h4>
                    </button>
                </h2>
                <div id="collapseFour" class="accordion-collapse collapse show" aria-labelledby="headingFour" data-bs-parent="#accordionExample">
                    <div class="accordion-body">

                        <h6 style="text-align: left">Problem with other mappers</h6>

                        <ul class="list-group col-6">
                            <li class="list-group-item">Lack of type safety</li>
                            <li class="list-group-item">Performance</li>
                            <li class="list-group-item">debugging</li>
                        </ul>

                        <br/>&nbsp;
                        <br/>&nbsp;
                        <h6 style="text-align: left">Advantages</h6>
                        <ul class="list-group col-6">
                            <li class="list-group-item">Mappings are defined in interfaces</li>
                            <li class="list-group-item">Generated java code at the compilation time</li>
                            <li class="list-group-item">Type-safe</li>
                            <li class="list-group-item">No Reflection</li>
                            <li class="list-group-item">No Runtime dependencies</li>
                            <li class="list-group-item">Easily customized formatters</li>
                        </ul>
                    </div>
                </div>
            </div>

            <div class="accordion-item">
                <h2 class="accordion-header" id="headingOne">
                    <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="false" aria-controls="collapseOne">
                        <h4>Basic</h4>
                    </button>
                </h2>
                <div id="collapseOne" class="accordion-collapse collapse" aria-labelledby="headingOne" data-bs-parent="#accordionExample">
                    <div class="accordion-body">
                        <div class="row">
                            <div class="col-12">
                                <button type="button" class="btn btn-success" id="basicDemo">Map to Dto (Basic)</button>
                                <br/>&nbsp;
                            </div>
                            <div class="col-6">
                                <textarea class="form-control" id="basic-input" style="font-size: 10px" rows="15" disabled>
{
  "id" : 1,
  "f_name" : "john",
  "l_name" : "doe",
  "email" : "someemai@hms.com",
  "phone" : "1234567790",
  "address" : {
    "id" : 1,
    "address1" : "1313 Meadow Creek",
    "address2" : "APT ###",
    "city" : "Irving",
    "state" : "TX"
  },
  "dob" : 1614712379610,
  "balance" : 1234
}
                                </textarea>
                            </div>
                            <div class="col-6">
                                <textarea id="basic-output" class="form-control" style="font-size: 10px" rows="15" disabled></textarea>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="accordion-item">
                <h2 class="accordion-header" id="headingTwo">
                    <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                        <h4>Advanced</h4>
                    </button>
                </h2>
                <div id="collapseTwo" class="accordion-collapse collapse" aria-labelledby="headingTwo" data-bs-parent="#accordionExample">
                    <div class="accordion-body">
                        <div class="row">
                            <div class="col-12">
                                <button type="button" class="btn btn-success" id="advDemo">Map to Dto (Advanced)</button>
                                <br/>&nbsp;
                            </div>
                            <div class="col-6">
                                <textarea class="form-control" id="adv-input" style="font-size: 10px" rows="15" disabled>
{
  "id" : 1,
  "f_name" : "john",
  "l_name" : "doe",
  "email" : "someemai@hms.com",
  "phone" : "1234567790",
  "address" : {
    "id" : 1,
    "address1" : "1313 Meadow Creek",
    "address2" : "APT ###",
    "city" : "Irving",
    "state" : "TX"
  },
  "dob" : 1614712379610,
  "balance" : 1234
}
                                </textarea>
                            </div>
                            <div class="col-6">
                                <textarea id="adv-output" class="form-control" style="font-size: 10px" rows="15" disabled>

                                </textarea>
                            </div>
                        </div>

                    </div>
                </div>
            </div>

            <div class="accordion-item">
                <h2 class="accordion-header" id="headingThree">
                    <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
                        <h4>Speed</h4>
                    </button>
                </h2>
                <div id="collapseThree" class="accordion-collapse collapse" aria-labelledby="headingThree" data-bs-parent="#accordionExample">
                    <div class="accordion-body">
                        <input type="number" class="form-control" id="rNumber"> <br/>&nbsp;
                        <button type="button" class="btn btn-success" id="mapTest">Test Speed</button>
                        <br/>&nbsp;
                        <p>total time for mapstruct : <span id="mapResponse" class="badge rounded-pill bg-success">0</span> ms.</p>
                        <p>total time for beanUtils : <span id="beanUtilsResponse" class="badge rounded-pill bg-success">0</span> ms.</p>

                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script type="text/javascript">
  $(document).ready(function () {
    var basic_output = $("#basic-output");

    $('#basicDemo').click(function () {
      var message = $('#basic-input').val();
      if (message.length == 0) {
        alert("message is empty please try again!")
      } else {
        sendMessage("personSimple", message, basic_output);
      }
    });

    var adv_output = $("#adv-output");

    $('#advDemo').click(function () {
      var message = $('#adv-input').val();
      if (message.length == 0) {
        alert("message is empty please try again!")
      } else {
        sendMessage("personAdvanced", message, adv_output);
      }
    });

    var mapResponse = $("#mapResponse");
    var beanUtilsResponse = $("#beanUtilsResponse");

    $('#mapTest').click(function () {
      var message = $('#rNumber').val();
      if (message.length == 0) {
        alert("message is empty please try again!")
      } else {
        mapResponse.text("");
        beanUtilsResponse.text("");
        sendMessageGET("m/"+message, mapResponse);
        sendMessageGET("o/"+message, beanUtilsResponse);
      }
    });



    function sendMessage(url, message, messageArea) {
      $.ajax({
        url: "/" + url,
        method: "POST",
        contentType: "application/json; charset=utf-8",
        data: message,
      }).done(function (msg) {
        messageArea.text(JSON.stringify(msg));
        $('#messageResult').show();
      }).fail(function (jqXHR, textStatus) {
        alert("Request failed: " + textStatus);
      });
    }

    function sendMessageGET(url, messageArea) {
      var ajaxTime= new Date().getTime();
      $.ajax({
        url: "/" + url,
        method: "GET",
      }).done(function (msg) {
        var totalTime = new Date().getTime()-ajaxTime;
        messageArea.text(totalTime);
        $('#messageResult').show();
      }).fail(function (jqXHR, textStatus) {
        alert("Request failed: " + textStatus);
      });
    }

  });
</script>
</html>