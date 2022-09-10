import React from 'react';
import {
  MDBBtn,
  MDBContainer,
  MDBCard,
  MDBCardBody,
  MDBInput,
  MDBCheckbox
}
from 'mdb-react-ui-kit';

export default function BuyerReg() {
  return (
    <MDBContainer fluid className='d-flex align-items-center justify-content-center bg-image' >
      <div className='mask gradient-custom-3'></div>
      <MDBCard className='m-5' style={{maxWidth: '600px'}}>
        <MDBCardBody className='px-5'>
          <h2 className="text-uppercase text-center mb-5">Buyer Registration</h2>
          <MDBInput wrapperClass='mb-4' label='First Name' size='lg' id='fname' type='text'/>
          <MDBInput wrapperClass='mb-4' label='Last Name' size='lg' id='lname' type='text'/>
          <MDBInput wrapperClass='mb-4' label='Your Email' size='lg' id='email' type='email'/>
          <MDBInput wrapperClass='mb-4' label='Your Contact' size='lg' id='contact' type='number'/>
          <MDBInput wrapperClass='mb-4' label='Your Adress' size='lg' id='address' type='text'/>
          <MDBInput wrapperClass='mb-4' label='Your City' size='lg' id='city' type='text'/>
          <MDBInput wrapperClass='mb-4' label='Your Pin' size='lg' id='pin' type='number'/>
          <MDBInput wrapperClass='mb-4' label='Your Username' size='lg' id='uname' type='text'/>
          <MDBInput wrapperClass='mb-4' label='Password' size='lg' id='password' type='password'/>
          <MDBInput wrapperClass='mb-4' label='Repeat your password' size='lg' id='password1' type='password'/>
          <div className='d-flex flex-row justify-content-center mb-4'>
            <MDBCheckbox name='flexCheck' id='flexCheckDefault' label='I agree all statements in Terms of service' />
          </div>
          <MDBBtn className='mb-4 w-100 gradient-custom-4' size='lg'>Register</MDBBtn>
        </MDBCardBody>
      </MDBCard>
    </MDBContainer>
  );
}
