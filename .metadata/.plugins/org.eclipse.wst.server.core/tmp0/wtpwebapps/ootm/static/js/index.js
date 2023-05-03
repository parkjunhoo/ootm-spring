let list = document.getElementsByClassName("carouselItem");
this.addEventListener('scroll',()=>{
    for(i =0; i<list.length; i++){
        list[i].style.transform = `translateY(${window.scrollY/2}px)`;
    }
});

let element = document.getElementById('videoSection1');

let options = {
  root: null,
  rootMargin: '0px',
  threshold: 0
};

function callback(entries, observer) {
  entries.forEach(entry => {
    if (entry.isIntersecting) {
    	element.firstElementChild.style.zIndex ="-9";
    } else {
    	element.firstElementChild.style.zIndex ="-11";
    }
  });
}

let observer = new IntersectionObserver(callback, options);
observer.observe(element);