<%-- 
    Document   : Nuevo
    Created on : 22/11/2015, 01:06:10 AM
    Author     : pantojarosales
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <script src="../assets/js/jquery.js"></script>
               <script src="../assets/js/bootstrap.min.js"></script>
        <script src="../assets/js/jquery-ui-1.9.2.custom.min.js"></script>
        <script src="../assets/js/jquery.ui.touch-punch.min.js"></script>
        <script class="include" type="text/javascript" src="../assets/js/jquery.dcjqaccordion.2.7.js"></script>
        <script src="../assets/js/jquery.scrollTo.min.js"></script>
        <script src="../assets/js/jquery.nicescroll.js" type="text/javascript"></script>
        
        <script src="Sucursal.js" type="text/javascript"></script>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">


        <title>DASHGUM - Bootstrap Admin Template</title>

        <!-- Bootstrap core CSS -->
        <link href="../assets/css/bootstrap.css" rel="stylesheet">
        <!--external css-->
        <link href="../assets/font-awesome/css/font-awesome.css" rel="stylesheet" />

        <!-- Custom styles for this template -->
        <link href="../assets/css/style.css" rel="stylesheet">
        <link href="../assets/css/style-responsive.css" rel="stylesheet">

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>

    <body>

        <section id="container" >
            <!-- **********************************************************************************************************************************************************
            TOP BAR CONTENT & NOTIFICATIONS
            *********************************************************************************************************************************************************** -->
            <!--header start-->
            <header class="header black-bg">
                <div class="sidebar-toggle-box">
                    <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
                </div>
                <!--logo start-->
                <a href="index.html" class="logo"><b>Tienda Rosita</b></a>
                <!--logo end-->

                <div class="top-menu">
                    <ul class="nav pull-right top-menu">
                        <li><a class="logout" href="login.html">Logout</a></li>
                    </ul>
                </div>
            </header>
            <!--header end-->

            <!-- **********************************************************************************************************************************************************
            MAIN SIDEBAR MENU
            *********************************************************************************************************************************************************** -->
            <!--sidebar start-->
            <aside>
                <div id="sidebar"  class="nav-collapse ">
                    <!-- sidebar menu start-->
                    <ul class="sidebar-menu" id="nav-accordion">

                        <p class="centered"><a href="profile.html"><img src="../assets/img/ui-sam.jpg" class="img-circle" width="60"></a></p>
                        <h5 class="centered">Cesar Pantoja Rosales</h5>

                        <li class="mt">
                            <a href="index.html">
                                <i class="fa fa-dashboard"></i>
                                <span>Dashboard</span>
                            </a>
                        </li>

                        <li class="sub-menu">
                            <a href="javascript:;" >
                                <i class="fa fa-desktop"></i>
                                <span>UI Elements</span>
                            </a>
                            <ul class="sub">
                                <li><a  href="general.html">General</a></li>
                                <li><a  href="buttons.html">Buttons</a></li>
                                <li><a  href="panels.html">Panels</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </aside>
            <!--sidebar end-->

            <!-- **********************************************************************************************************************************************************
            MAIN CONTENT
            *********************************************************************************************************************************************************** -->
            <!--main content start-->
            <section id="main-content">
                <section class="wrapper site-min-height">
                    <h3><i class="fa fa-angle-right"></i> Nueva Sucursal</h3>
                    <div class="row mt">
                        <div class="col-lg-12">
                            <div class="row mt">
                                <div class="col-lg-12">
                                    <div class="form-panel">
                                        <form class="form-horizontal style-form" >
                                            <div class="form-group">
                                                <label class="col-sm-2 col-sm-2 control-label">ID :</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" id="txt_id">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 col-sm-2 control-label">Nombre :</label>
                                                <div class="col-sm-10">
                                                    <input  class="form-control" id="txt_nombre">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 col-sm-2 control-label">Direccion :</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" id="txt_direccion">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-sm-2 col-sm-2 control-label">Telefono :</label>
                                                <div class="col-sm-10">
                                                    <input type="text" class="form-control" id="txt_telefono">
                                                </div>
                                            </div>
                                            <div class="btn btn-theme" title="Guardar" id="btn_guardar">GUARDAR</div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </section><! --/wrapper -->
            </section><!-- /MAIN CONTENT -->

            <!--main content end-->
            <!--footer start-->
            <footer class="site-footer">
                <div class="text-center">
                    2015- Te amo mucho claudia
                    <a href="blank.html#" class="go-top">
                        <i class="fa fa-angle-up"></i>
                    </a>
                </div>
            </footer>
            <!--footer end-->
        </section>

        <!-- js placed at the end of the document so the pages load faster -->

        <!--common script for all pages-->
        <script src="../assets/js/common-scripts.js"></script>



    </body>
</html>
