import { Component, OnInit } from '@angular/core';
import {photoService} from './photo.service'
import {photo} from './photo'
@Component({
    selector: 'pictures',
   template:`<h1>photos</h1>
   <table border="1">
   <tr>
   <th>id</th>
   <th>title</th>
   <th>url</th>
   <th>image</th>
   </tr>
   <tr *ngFor="let photo of photos; let i=index;">
   <td>{{photo.id}}</td>
   <td>{{photo.title}}</td>
   <td>{{photo.url}}</td>
   <td><img [src]="photo.thumbnailUrl"/></td>
   </tr>   
</table> 
   `,
    providers:[photoService]
})
export class PhotoComponent implements OnInit {
    photos:Array<photo>;
    constructor(private photoservice:photoService) { 



    }

    ngOnInit() { 

        this.photoservice.getphotos().then(
        data=>{this.photos=data;}


        )
    }
}