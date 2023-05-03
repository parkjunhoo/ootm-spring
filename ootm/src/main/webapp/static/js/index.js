let list = document.getElementsByClassName("carouselItem");
this.addEventListener('scroll',()=>{
    for(i =0; i<list.length; i++){
        list[i].style.transform = `translateY(${window.scrollY/2}px)`;
    }
});

let options = {
  root: null,
  rootMargin: '0px',
  threshold: 0
};

function callback(entries, observer) {
  entries.forEach(entry => {
    if (entry.isIntersecting) {
    	element.firstElementChild.style.display ="block";
    } else {
    	element.firstElementChild.style.display ="none";
    }
  });
}

function callback2(entries, observer) {
  entries.forEach(entry => {
    if (entry.isIntersecting) {
    	element2.firstElementChild.style.display ="block";
    } else {
    	element2.firstElementChild.style.display ="none";
    }
  });
}

function callback3(entries, observer) {
  entries.forEach(entry => {
    if (entry.isIntersecting) {
    	element3.firstElementChild.style.display ="block";
    } else {
    	element3.firstElementChild.style.display ="none";
    }
  });
}

let element = document.getElementById('videoSection1');
let observer = new IntersectionObserver(callback, options);
observer.observe(element);

let element2 = document.getElementById('videoSection2');
let observer2 = new IntersectionObserver(callback2, options);
observer2.observe(element2);

let element3 = document.getElementById('videoSection3');
let observer3 = new IntersectionObserver(callback3, options);
observer3.observe(element3);