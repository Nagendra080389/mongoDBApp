<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>MeraComputer</title>
<link rel="stylesheet" href="resources/css/style.css">
</head>
<body>

<section class="container">
    <div class="login">
      <h1>Add Cabinet</h1>
      <form method="post" action="/MeraComputer/addCabinet">
        <p>
         <select id="dropdown" name="dropdown">
                            <option value="MICRO_ATX" selected="selected"> MICRO_ATX </option>
                            <option value="MINI_ATX"> MINI_ATX </option>
                        </select>
        </p>
        <p><input type="text" name="cabinetType" value="" placeholder="CabinetType"></p>
        <p class="submit"><input type="submit" name="commit" value="Add Cabinet"></p>

      </form>

      <br>
          <form action='/MeraComputer/logout' method='POST'>
          <input type='hidden' id='sessionID' name='sessionID' value=${sessionID}/>
          <input type='submit' value="Logout"/>
          </form>
    </div>


  </section>


</body>
</html>