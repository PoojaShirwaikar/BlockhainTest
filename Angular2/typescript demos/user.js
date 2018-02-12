"use strict";
exports.__esModule = true;
var user = /** @class */ (function () {
    function user(name, age) {
        this.name = name;
        this.age = age;
        this.isIndian = true;
    }
    user.prototype.getName = function () {
        return this.name;
    };
    return user;
}());
exports.user = user;
