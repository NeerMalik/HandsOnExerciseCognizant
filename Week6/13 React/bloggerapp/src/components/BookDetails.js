import React from "react";

function BookDetails() {

    const books = [
        {
            id: 1,
            name: "Java Programming",
            author: "Herbert Schildt"
        },
        {
            id: 2,
            name: "React Guide",
            author: "Dan Abramov"
        },
        {
            id: 3,
            name: "NodeJS",
            author: "Ryan Dahl"
        }
    ];

    return (

        <div>

            <h2>Book Details</h2>

            {
                books.map(book => (

                    <div key={book.id}>

                        <h4>{book.name}</h4>

                        <p>{book.author}</p>

                    </div>

                ))
            }

        </div>

    );
}

export default BookDetails;