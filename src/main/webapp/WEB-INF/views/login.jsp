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
      <h1>Login to MeraComputer</h1>
      <form method="post" action="/MeraComputer/loginForm">
        <p><input type="text" name="username" required value="" placeholder="Username or Email"></p>
        <p><input type="password" name="password" required value="" placeholder="Password"></p>
        <p style="color:red;">${errorMessage}</p>
        <p class="remember_me">
          <label>
            <input type="checkbox" name="remember_me" id="remember_me">
            Remember me on this computer
          </label>
        </p>
        <p class="submit"><input type="submit" name="commit" value="Login"></p>

      </form>
      <br>
      <form method = "post" action = "/MeraComputer/register">
      <p class="submit"><input type="submit" name="commit" value="Register"></p>
      </form>
    </div>

    <div class="login-help">
      <p>Forgot your password? <a href="#">Click here to reset it</a>.</p>
    </div>
  </section>


</body>
</html>