import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";

import './panel1/panel1.js'


declare  var  $:any;

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'app';

  message: string;

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    (<HTMLInputElement> document.getElementById("button2")).disabled = true;




    $(document).ready(function() {

      $('#button1').click(function() {
        (<HTMLInputElement> document.getElementById("button2")).disabled = false;
        $.ajax({
          type : 'GET',
          contentType: "application/json",
          url : '/gen',
          success : function(result) {
            $('#liczby').val(result);
            $('#liczby1').val('');

          }
        });
      });

      $('#button2').click(function() {
        (<HTMLInputElement> document.getElementById("button2")).disabled = true;
        $.ajax({
          type : 'GET',
          contentType: "application/json",
          url : '/avg',
          success : function(result) {
            $('#liczby1').val(result);

          }

        });
      });
    });



    }



}
