using System.Collections;
using System.Collections.Generic;
using System.Numerics;
using UnityEngine;
using Vector3 = UnityEngine.Vector3;

public class Movement : MonoBehaviour
{
    [SerializeField] private float speed;
    [SerializeField] private float rotationSpeed;

    // Update is called once per frame
    void Update()
    {
        Vector3 currentCoords = transform.position;
        
        float horizontalAxis = Input.GetAxis("Horizontal");
        float verticalAxis = Input.GetAxis("Vertical");
        
        Vector3 direction = Vector3.right * horizontalAxis + Vector3.forward * verticalAxis;
        
        Vector3 velocity = direction * speed;
        
        Vector3 displacement = velocity * Time.deltaTime;

        //currentCoords += displacement;
        
        transform.Rotate(0, horizontalAxis * rotationSpeed * Time.deltaTime, 0);
        
        transform.Translate(displacement);
    }
}
