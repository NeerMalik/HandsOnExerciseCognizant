import React from "react";

function CourseDetails() {

    const courses = [

        {
            id: 1,
            name: "React",
            duration: "2 Months"
        },

        {
            id: 2,
            name: "Java",
            duration: "3 Months"
        }

    ];

    return (

        <div>

            <h2>Course Details</h2>

            {
                courses.map(course => (

                    <div key={course.id}>

                        <h4>{course.name}</h4>

                        <p>{course.duration}</p>

                    </div>

                ))
            }

        </div>

    );
}

export default CourseDetails;