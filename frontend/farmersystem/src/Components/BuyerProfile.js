import React from 'react';
import { MDBCol, MDBContainer, MDBRow, MDBCard, MDBCardText, MDBCardBody, MDBCardImage, MDBTypography, MDBIcon,MDBInput } from 'mdb-react-ui-kit';

export default function BuyerProfile() {
  return (
    <section className="vh-100" style={{ backgroundColor: '#f4f5f7' }}>
      <MDBContainer className="py-5 h-100">
        <MDBRow className="justify-content-center align-items-center h-100">
          <MDBCol lg="6" className="mb-4 mb-lg-0">
            <MDBCard className="mb-3" style={{ borderRadius: '.5rem' }}>
              <MDBRow className="g-0">
                <MDBCol md="4" className="gradient-custom text-center text-white"
                  style={{ borderTopLeftRadius: '.5rem', borderBottomLeftRadius: '.5rem' }}>
                  
                  <MDBTypography tag="h5">Marie Horwitz</MDBTypography>
                  <MDBCardText>Web Designer</MDBCardText>
                  <MDBIcon far icon="edit mb-5" />
                </MDBCol>
                <MDBCol md="8">
                  <MDBCardBody className="p-4">
                    <MDBTypography tag="h6">Information</MDBTypography>
                    <hr className="mt-0 mb-4" />
                    <MDBRow className="pt-1">
                    <MDBCol size="6" className="mb-3">
                        <MDBTypography tag="h6">Buyer Name</MDBTypography>
                        <MDBCardText className="text-muted">XYZ</MDBCardText>
                      </MDBCol>
                      <MDBCol size="6" className="mb-3">
                        <MDBTypography tag="h6">Email</MDBTypography>
                        <MDBCardText className="text-muted">info@example.com</MDBCardText>
                      </MDBCol>
                      <MDBCol size="6" className="mb-3">
                        <MDBTypography tag="h6">Phone</MDBTypography>
                        <MDBCardText className="text-muted">1234567890</MDBCardText>
                      </MDBCol>
                    </MDBRow>

                    <MDBTypography tag="h6">Product List</MDBTypography>
                    <hr className="mt-0 mb-4" />
                    {/* <MDBRow className="pt-1">
                      <MDBCol size="6" className="mb-3">
                        <MDBTypography tag="h6">Availiable Product</MDBTypography>
                        { <MDBCardText className="text-muted">Potato , Tomato, Chillis</MDBCardText> }
                        <MDBInput wrapperClass='mb-4 w-100' label='Products' id='Product Availablity' type='text' size="lg"/>
                      </MDBCol>
                      <MDBCol size="6" className="mb-3">
                        <MDBTypography tag="h6">trusted Custmers</MDBTypography>
                        
                        <MDBInput wrapperClass='mb-4 w-100' label='trusted Custmers to be show ' id='1234567' type='number' size="lg"/>
                      </MDBCol>
                    </MDBRow> */}

                    <div className="d-flex justify-content-start">
                      <a href="#!"><MDBIcon fab icon="facebook me-3" size="lg" /></a>
                      <a href="#!"><MDBIcon fab icon="twitter me-3" size="lg" /></a>
                      <a href="#!"><MDBIcon fab icon="instagram me-3" size="lg" /></a>
                    </div>
                  </MDBCardBody>
                </MDBCol>
              </MDBRow>
            </MDBCard>
          </MDBCol>
        </MDBRow>
      </MDBContainer>
    </section>
  );
}