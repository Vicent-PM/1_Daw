using UnityEngine;

public class Ejercicio1 : MonoBehaviour
{
    private int speed = 5;
    private float accelerationX = 0;
    private float accelerationY = 0;
    private float accelerationSpeed = 0.0002f;

    // Update is called once per frame
    void Update()
    {
        float horizontalAxis = Input.GetAxisRaw("Horizontal");
        float verticalAxis = Input.GetAxisRaw("Vertical");

        if (accelerationX < horizontalAxis)
        {
            accelerationX += accelerationSpeed;
        } else if (accelerationX > horizontalAxis)
        {
            accelerationX -= accelerationSpeed;
        }
        
        if (accelerationY < horizontalAxis)
        {
            accelerationY += accelerationSpeed;
        } else if (accelerationY > horizontalAxis)
        {
            accelerationY -= accelerationSpeed;
        }

        Vector3 direction = (accelerationX * horizontalAxis) * Vector3.right + (accelerationY * verticalAxis) * Vector3.up;
        Vector3 velocity = direction * Time.deltaTime;
        Vector3 displacement = velocity * speed;

        transform.position += displacement;

        if (transform.position.x < 0)
        {
            displacement *= 2;
        }
    }
}