<%@ page import="kz.bitlab.db.DBManager" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.db.Footballer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import = "java.util.ResourceBundle" %>
<html>
<head>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <title>Title</title>
</head>
<body>
<h1 class="text-center">Footballer adding list</h1>
  <div class="container mt-3">
    <form action="/homeservlet" method="post">
      NAME: <input name="footballer_name" class="form-control" type="text" placeholder="Insert name">
      SURNAME:  <input name="footballer_surname" class="form-control" type="text" placeholder="Insert surname">
      CLUB: <select class="form-control" name="club">
                <option>Real Madrid</option>
                <option>Barcelona</option>
                <option>Atletico Madrid</option>
                <option>Manchester United</option>
                <option>Manchester City</option>
                <option>Chelsea</option>
                <option>Arsenal</option>
                <option>Liverpool</option>
                <option>Aston Villa</option>
                <option>Everton</option>
                <option>Brighton</option>
                <option>Tottenham</option>
                <option>Leicester</option>
                <option>Newcastle United</option>
                <option>WestHam</option>
                <option>Crystal Palace</option>
                <option>Norwich City</option>
                <option>Burnly</option>
                <option>Woolwerhampton</option>
                <option>Brentford</option>
                <option>Southhampton</option>
                <option>Leeds</option>
                <option>Watford</option>
                <option>Bayer Munchen</option>
                <option>Borrusia Dortmund</option>
                <option>PSG</option>
                <option>Marselle</option>
                <option>Monaco</option>
                <option>Inter</option>
                <option>Milan</option>
                <option>Juventus</option>
            </select>
      SALARY: <input type="number" class="form-control" name="footballer_salary" placeholder="Insert salary">
      TRANSFER PRICE: <input type="number" class="form-control" name="footballer_price" placeholder="Insert transfer price">
        <button class="btn btn-primary mt-3">ADD FOOTBALLER</button>
    </form>

    <hr>
    <div class="w-25">
        <%
            ArrayList<Footballer> footballers = DBManager.getAllFootballers();
            for (Footballer ftb : footballers){
        %>
            <h3 class="text-center" style="color: forestgreen">
            <%
                out.print(ftb.getName() + " " + ftb.getSurname());
            %>
            </h3>
            <h5 style="color: darkblue">
            <%
                out.print("Club: " + ftb.getClub());
            %>
            </h5>
        <h5 style="color: darkred">
            <%
                out.print("Salary: " + ftb.getSalary());
            %>
        </h5>
        <h5 style="color: darkred">
            <%
                out.print("Transfer price: " + ftb.getTransferPrice());
            %>
        </h5>
        <h1>-----------------</h1>
        <%
            }
        %>

    </div>
  </div>
</body>
</html>
