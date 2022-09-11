import React from 'react';
import {
  MDBBtn,
  MDBContainer,
  MDBRow,
  MDBCol,
  MDBCard,
  MDBCardBody,
  MDBInput,
  MDBIcon,
  MDBCheckbox
}
from 'mdb-react-ui-kit';

export default function FarmerWelcome() {
  return (
    <MDBContainer fluid>

      <MDBRow className='d-flex justify-content-center align-items-center h-100'>
        <MDBCol col='12'>

          <MDBCard className='bg-white my-5 mx-auto' style={{borderRadius: '1rem', maxWidth: '500px'}}>
            <MDBCardBody className='p-5 w-100 d-flex flex-column'>
              <h1 className="fst-italic ">Welcome Farmer</h1>
              <h2 className="fw-bold mb-2 text-center"> Available Products To Sell </h2>
              <p className="text-white-50 mb-3">Please enter Product Details</p>

              <MDBInput wrapperClass='mb-4 w-100' label='Crop Name' id='name' type='text' size="lg"/>
              <MDBInput wrapperClass='mb-4 w-100' label='Quantity' id='qty' type='number' size="lg"/>
              <MDBInput wrapperClass='mb-4 w-100' label='Expected Price' id='price' type='number' size="lg"/>
              <MDBInput wrapperClass='mb-4 w-100' label='Stock Available' id='Stock' type='number' size="lg"/>
              {/* #18FFFF */}
              <MDBBtn size='lg'>
               Add new Products
              </MDBBtn>

              <hr className="my-4"/>

            </MDBCardBody>
          </MDBCard>

          {/* <MDBTypography tag='h1' className='#18FFFF'>
             Welcome
            <MDBTypography tag='small' className='text-muted'>
            With faded secondary text
            </MDBTypography>
            </MDBTypography> */}
           
           

        </MDBCol>
      </MDBRow>

    </MDBContainer>
  );
}