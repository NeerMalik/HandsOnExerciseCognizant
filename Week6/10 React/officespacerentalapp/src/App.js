import React from "react";

function App() {

  // Office Object
  const office = {
    name: "Smart Business Center",
    rent: 55000,
    address: "Bangalore"
  };

  // List of Offices
  const officeList = [
    {
      id: 1,
      name: "Smart Business Center",
      rent: 55000,
      address: "Bangalore",
      image:
        "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=600"
    },
    {
      id: 2,
      name: "Tech Park",
      rent: 75000,
      address: "Hyderabad",
      image:
        "https://images.unsplash.com/photo-1497366412874-3415097a27e7?w=600"
    },
    {
      id: 3,
      name: "Corporate Hub",
      rent: 45000,
      address: "Chennai",
      image:
        "https://images.unsplash.com/photo-1497366216548-37526070297c?w=600"
    }
  ];

  return (
    <div style={{ padding: "20px" }}>

      {/* Heading */}
      <h1>Office Space Rental App</h1>

      {/* Single Office Details */}
      <h2>Featured Office</h2>

      <img
        src={officeList[0].image}
        alt="Office Space"
        width="400"
        height="250"
      />

      <h3>Name : {office.name}</h3>

      <h3
        style={{
          color: office.rent < 60000 ? "red" : "green"
        }}
      >
        Rent : Rs. {office.rent}
      </h3>

      <h3>Address : {office.address}</h3>

      <hr />

      <h2>Available Office Spaces</h2>

      {
        officeList.map((item) => (

          <div
            key={item.id}
            style={{
              border: "1px solid gray",
              padding: "15px",
              marginBottom: "20px",
              width: "450px"
            }}
          >

            <img
              src={item.image}
              alt={item.name}
              width="400"
              height="250"
            />

            <h3>{item.name}</h3>

            <h3
              style={{
                color: item.rent < 60000 ? "red" : "green"
              }}
            >
              Rent : Rs. {item.rent}
            </h3>

            <h3>Address : {item.address}</h3>

          </div>

        ))
      }

    </div>
  );
}

export default App;