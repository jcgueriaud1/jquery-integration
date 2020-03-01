import jQuery from 'jquery';

window.jQuery = jQuery;
window.$ = jQuery;

if (typeof jQuery !== 'undefined') {
    alert("jQuery is loaded in a javascript file");
} else {
    alert("jQuery is not loaded in a javascript file");
}