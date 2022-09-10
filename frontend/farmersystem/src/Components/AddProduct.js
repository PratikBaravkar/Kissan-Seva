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

export default function AddProduct() {
  return (
    <MDBContainer fluid>

      <MDBRow className='d-flex justify-content-center align-items-center h-100'>
        <MDBCol col='12'>

          <MDBCard className='bg-white my-5 mx-auto' style={{borderRadius: '1rem', maxWidth: '500px'}}>
            <MDBCardBody className='p-5 w-100 d-flex flex-column'>

              <h2 className="fw-bold mb-2 text-center">Add Product</h2>
              <p className="text-white-50 mb-3">Please enter Product Details</p>

              <MDBInput wrapperClass='mb-4 w-100' label='Crop Name' id='name' type='text' size="lg"/>
              <MDBInput wrapperClass='mb-4 w-100' label='Quantity' id='qty' type='number' size="lg"/>
              <MDBInput wrapperClass='mb-4 w-100' label='Expected Price' id='price' type='number' size="lg"/>

              <MDBBtn size='lg'>
                Add Product
              </MDBBtn>

              <hr className="my-4"/>

            </MDBCardBody>
          </MDBCard>

        </MDBCol>
      </MDBRow>

    </MDBContainer>
  );
}