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
      <h1>Register to MeraComputer</h1>
      <form method="post" action="/MeraComputer/registerUser">
        <p><input type="text" name="username" required value="" placeholder="Username"></p>
        <p><input type="text" name="password" required value="" placeholder="Password"></p>
        <p><input type="text" name="firstname" required value="" placeholder="FirstName"></p>
        <p><input type="text" name="lastname" required value="" placeholder="LastName"></p>
        <p class="submit"><input type="submit" name="commit" value="Register"></p>
      </form>
    </div>

  </section>


</body>
</html>