$(document).ready(function(){$.validator.addMethod("orcid",function(value,element){return this.optional(element)||/(?:\d{4}-){3,}\d{3}[\dX]/.test(value);});$("#beta-test").validate({rules:{"00NG000000DfstR":"required","first_name":{required:true},"last_name":{required:true,maxlength:80},"title":{maxlength:40},"email":{required:true,email:true,maxlength:80},"00NG000000CczB5":{orcid:true,maxlength:19,required:true},"company":{required:true,maxlength:40},"URL":{maxlength:80},"country_code":{required:true},"city":{required:true,maxlength:40}},messages:{"00NG000000DfstR":"Please select a program","first_name":"First name is required","last_name":"Last name is required","email":"Email is required","00NG000000CczB5":"Must be a valid ORCID","company":"Company is required","country_code":"Country is required","city":"City is required"}});});