import React from "react";

import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App() {

    const showBooks = true;
    const showBlogs = true;
    const showCourses = true;

   
    let bookComponent;

    if (showBooks) {
        bookComponent = <BookDetails />;
    }

    return (

        <div style={{ padding: "20px" }}>

            <h1>Blogger App</h1>

          
            {bookComponent}

            <hr />

           
            {
                showBlogs
                    ? <BlogDetails />
                    : <h3>Blogs Not Available</h3>
            }

            <hr />

           
            {
                showCourses && <CourseDetails />
            }

        </div>

    );

}

export default App;