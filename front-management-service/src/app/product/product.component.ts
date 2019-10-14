import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const BASE_URL = 'http://192.168.99.101:8100';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  products;

  constructor(private _http: HttpClient) { }

  ngOnInit() {
    this._http.get(`${BASE_URL}/product-management/products`).subscribe(products => (this.products = products));
  }

}
