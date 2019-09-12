import React from 'react';
import logo from './logo.svg';
import './App.css';

class App extends React.Component{
  render(){
  return (
    <div className="App">
      <div class="container">
        <div class="row justify-content-center">
          <div class="col-xl-10 col-lg-12 col-md-9">

            <div class="card o-hidden border-0 shadow-lg my-5">
              <div class="card-body p-0">

                <div class="row">
                  <div class="col-lg-5 d-none d-lg-block bg-login-image"></div>
                  <div class="col-lg-7">
                    <div class="p-5">
                      <div class="text-center">
                        <h1 class="h4 text-gray-900 mb-4">Welcome To Asirvad Microfinance...</h1>
                      </div>
                      <form class="user">
                      <div class="form-group">
                        <input type="email" class="form-control form-control-user" id="exampleInputEmail" aria-describedby="emailHelp" placeholder="Enter Email Address..." />
                      </div>
                <div class="form-group">
                  <input type="password" class="form-control form-control-user" id="exampleInputPassword" placeholder="Password" />
                </div>
                
                <a href="index.html" class="btn btn-primary btn-user btn-block">
                  Login
                </a>
                <hr/>
                
              </form>
              <hr />
              <div class="text-center">
                <a class="small" href="forgot-password.html">Forgot Password?</a>
              </div>
              <div class="text-center">
                <a class="small" href="register.html">Create an Account!</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

  </div>

</div>
</div>
</div>
);
}
}

export default App;
