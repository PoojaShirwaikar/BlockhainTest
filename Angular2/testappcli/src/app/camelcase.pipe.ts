import { Pipe, PipeTransform } from '@angular/core';

@Pipe({name: 'camelcase'})
export class CamelCasePipe implements PipeTransform {
    transform(value: string, args:string[]): any {
        if (!value) {
            return '';
        } else {
            return value.replace(/\w\S*/g, (txt => txt[0].toUpperCase() + txt.substr(1).toLowerCase() ));
        }

    }
}