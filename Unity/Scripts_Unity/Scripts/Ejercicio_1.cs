using UnityEngine;

public class Ejercicio_1 : MonoBehaviour
{
    private float speed = 5;

    // Update is called once per frame
    void Update()
    {
        float horizontalAxis = Input.GetAxis("Horizontal");
        float verticalAxis = Input.GetAxis("Vertical");

        Vector3 direction = horizontalAxis * Vector3.right + verticalAxis * Vector3.up;
        direction.Normalize();
        if (direction.x < 0)
        {
            direction *= 2;
        }
        Vector3 velocity = direction * speed;
        Vector3 displacement = velocity * Time.deltaTime;

        transform.position += displacement;
    }
}