

    <!-- Left side column. contains the logo and sidebar -->
    <aside class="main-sidebar"> 
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar"> 
			
            <!-- Sidebar user info -->
            <div class="user-panel">
                <div class="pull-left image">
					<img src="/assets/img/user2-160x160.jpg" class="img-circle" alt="User Image">
				</div>
                <div class="pull-left info">
                    <p>{{currentUserName}} </p>
                    <a >
						<i class="fa fa-circle text-success"></i> Online
					</a>
				</div>
            </div>
			
            <!-- search form -->
            <form action="#" method="get" class="sidebar-form">
                <div class="input-group">
                    <input type="text" name="q" class="form-control" placeholder="Search...">
                    <span class="input-group-btn">
                    	<button type="submit" name="search" id="search-btn" class="btn btn-flat">
							<i class="fa fa-search"></i>
						</button>
                    </span>
				</div>
            </form>
            
             
			
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu" data-widget="tree" ng-init ="getCurrentUser()">
				
              
				
                       <li>
							<a href="#">
								<i class="fa fa-circle-o"></i> Dashboard
							</a> 
						</li>
						 <li class="treeview">
					<a href="#">
						<i class="fa fa-folder"></i>
						<span>Accounts</span>
						<span class="pull-right-container">
							<i class="fa fa-angle-left pull-right"></i>
						</span>
					</a>
                    <ul class="treeview-menu">
                      
                        <li>
							<!-- <a href="#projectListload" ng-click="projectlistload()"><i class="fa fa-circle-o"></i> Accounts Turnover</a> -->
							<a href="#accountsListload" ng-click="accountsLoad()"><i class="fa fa-circle-o"></i> Accounts Turnover</a>
						</li>
    
                    </ul>
                </li>
                <!--  
                  <li class="treeview">
					<a href="#">
						<i class="fa fa-folder"></i>
						<span>Item</span>
						<span class="pull-right-container">
							<i class="fa fa-angle-left pull-right"></i>
						</span>
					</a>
                    <ul class="treeview-menu">
                      
                        <li>
							<a href="#itemListload" ng-click="itemlistload()">
								<i class="fa fa-circle-o"></i> Item List
							</a>
						</li>
    
                    </ul>
                </li>
                
                
                      <li class="treeview">
					<a href="#">
						<i class="fa fa-folder"></i>
						<span>Vendor</span>
						<span class="pull-right-container">
							<i class="fa fa-angle-left pull-right"></i>
						</span>
					</a>
                    <ul class="treeview-menu">
                    
                       
                        <li>
								<a href="#vendorListload" ng-click="vendorlistload()">
								<i class="fa fa-circle-o"></i> Vendor List
							</a>
						</li>
						
						
				
						
						     <li>
							<a href="#vendorDocListload" ng-click="vendorDoclistload()">
								<i class="fa fa-circle-o"></i> Vendor Docs list
							</a>
						</li>
    
                    </ul>
                </li>
                
   
				-->
            
             
				
            </ul>
        </section>
        <!-- /.sidebar --> 
    </aside>