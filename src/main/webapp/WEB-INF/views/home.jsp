<!DOCTYPE html>

<html>
   <head>

       <meta charset="utf-8">
       <meta http-equiv="X-UA-Compatible" content="IE=edge">
       <meta name="viewport" content="width=device-width, initial-scale=1">
       <meta name="description" content="">
       <meta name="author" content="">

       <title>Mera Computer</title>

       <!-- Bootstrap Core CSS -->
       <link href="resources/css/bootstrap.min.css" rel="stylesheet">

       <!-- Custom CSS -->
       <link href="resources/css/grayscale.css" rel="stylesheet">

       <!-- Custom Fonts -->
       <link href="resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
       <link href="http://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic" rel="stylesheet" type="text/css">
       <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">

       <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
       <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
       <!--[if lt IE 9]>
           <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
           <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
       <![endif]-->

   </head>

   <body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

       <!-- Navigation -->
       <nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
           <div class="container">
               <div class="navbar-header">
                   <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                       <i class="fa fa-bars"></i>
                   </button>

               </div>

               <!-- Collect the nav links, forms, and other content for toggling -->
               <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
                   <ul class="nav navbar-nav">
                       <!-- Hidden li included to remove active class from about link when scrolled up past about section -->
                       <li class="hidden">
                           <a href="#page-top"></a>
                       </li>
                       <li>
                           <a class="page-scroll" href="#about">About</a>
                       </li>
                       <li>
                           <a class="page-scroll" href="#compatibilityChecker">Compatibility</a>
                       </li>
                       <li>
                            <a class="page-scroll" href="#buyComputer">BuyComputer</a>
                       </li>
                       <li>
                           <a class="page-scroll" href="#contact">Contact</a>
                       </li>
                       <li>
                            <a class="page-scroll" href="#login">Login</a>
                       </li>

                   </ul>
               </div>
               <!-- /.navbar-collapse -->
           </div>
           <!-- /.container -->
       </nav>

       <!-- Intro Header -->
       <header class="intro">
           <div class="intro-body">
               <div class="container">
                   <div class="row">
                       <div class="col-md-8 col-md-offset-2">
                           <h1 class="brand-heading">MeraComputer</h1>
                           <p class="intro-text">One Page for a Computer Shopping</p>
                           <a href="#about" class="btn btn-circle page-scroll">
                               <i class="fa fa-angle-double-down animated"></i>
                           </a>
                       </div>
                   </div>
               </div>
           </div>
       </header>

       <!-- About Section -->
       <section id="about" class="container content-section text-center">
           <div class="row">
               <div class="col-lg-8 col-lg-offset-2">
                   <h2>About MeraCompuetr</h2>
                   <p>MeraComputer is a site for Computer compatibility check.</p>
                   <p>Just pass your favourite MotherBoard/Processor/GrahicCard/Cabinet and we willl do the rest</a>.</p>
                   <p>MeraComputer includes a huge collection of AMD and Intel Processors</p>
                   <p>It also includes a huge collection of MotherBoard brands.</p>
               </div>
           </div>
       </section>

       <!-- Compatibility Section -->
       <section id="compatibilityChecker" class="content-section text-center">
           <div class="download-section">
               <div class="container">
                   <div class="col-lg-8 col-lg-offset-2">
                       <h2>compatibility Checker</h2>
                       <p>DropDown Will go here</a>
                   </div>
               </div>
           </div>
       </section>

    <!-- Compatibility Section -->
       <section id="buyComputer" class="content-section text-center">
           <div class="buy-section">
               <div class="container">
                   <div class="col-lg-8 col-lg-offset-2">
                       <h2>BuyComputer</h2>
                       <p>Buying Option Will go here</a>
                   </div>
               </div>
           </div>
       </section>

       <!-- Contact Section -->
       <section id="contact" class="container content-section text-center">
           <div class="row">
               <div class="col-lg-8 col-lg-offset-2">
                   <h2>Contact MeraComputer</h2>
                   <p>Feel free to email us to provide some feedback on our site, or to just say hello!</p>
                   <p><a href="#mailto:">FeedBack Or Suggestions will go here</a>
                   </p>
                   <ul class="list-inline banner-social-buttons">
                       <li>
                           <a href="#Twitter account will go here" class="btn btn-default btn-lg"><i class="fa fa-twitter fa-fw"></i> <span class="network-name">Twitter</span></a>
                       </li>
                       <li>
                           <a href="#GitHub account will go here" class="btn btn-default btn-lg"><i class="fa fa-github fa-fw"></i> <span class="network-name">Github</span></a>
                       </li>
                       <li>
                           <a href="#Google+ account will go here" class="btn btn-default btn-lg"><i class="fa fa-google-plus fa-fw"></i> <span class="network-name">Google+</span></a>
                       </li>
                   </ul>
               </div>
           </div>
       </section>

       <!-- Login Section -->
              <section id="login" class="container content-section text-center">
                  <div class="row">
                      <div class="col-lg-8 col-lg-offset-2">
                          <h2>Login MeraComputer</h2>
                          <form action="/MeraComputer/login" method="post">
                              <label for="username">UserName:</label>
                              <input type="text" name="username" required><br><br>
                              <label for="password">Password:</label>
                              <input type="password" name="password" required><br><br>
                              <input type="submit" value="Submit" style="background-color:black">
                          </form>
                      </div>
                  </div>
              </section>

       <!-- Map Section -->
       <div id="map"></div>

       <!-- Footer -->
       <footer>
           <div class="container text-center">
               <p>Copyright &copy; MeraComputer 2015</p>
           </div>
       </footer>

       <!-- jQuery -->
       <script src="resources/js/jquery.js"></script>

       <!-- Bootstrap Core JavaScript -->
       <script src="resources/js/bootstrap.min.js"></script>

       <!-- Plugin JavaScript -->
       <script src="resources/js/jquery.easing.min.js"></script>

       <!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->
       <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCRngKslUGJTlibkQ3FkfTxj3Xss1UlZDA&sensor=false"></script>

       <!-- Custom Theme JavaScript -->
       <script src="resources/js/grayscale.js"></script>

   </body>

</html>
