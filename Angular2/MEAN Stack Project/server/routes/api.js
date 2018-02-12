const express = require('express');
var mongoose = require('mongoose');

var user = require('./model/user');
const router = express.Router();
router.get('/', (req, res) => {
  res.send('api works');
});
router.route('/users')
.get(function(req,res){
  //Query the db and fetch the recoords 
  user.find(function(err,users){
    //Callback for the db call 
    if(err)
      res.send(err);
    else
      res.json(users);
  });

})
.post(function(req,res){
   var newobj = new user();
   newobj.name = req.body.name;
   newobj.age = req.body.age;
   newobj.address = req.body.address;
   newobj.save(function(err){
    res.send('New user added');
   })
   
})
router.route('/user/:name')
.get(function(req,res){
  var uname = req.params.name;
  user.find({name:uname},function(err,user){
    //check err obj
    res.json(user);
  });

})
.put(function(req,res){
  //findOneAndUpdate()
})
.delete(function(req,res){
  //findOneAndRemove()
})




module.exports = router;