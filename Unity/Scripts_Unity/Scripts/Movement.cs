using UnityEngine;


public class Movement : MonoBehaviour
{
    private int speed = 5;

    // Update is called once per frame
    void Update()
    {
        float horizontalAxis = Input.GetAxis("Horizontal");
        float verticalAxis = Input.GetAxis("Vertical");

        Vector3 direction = horizontalAxis * Vector3.right + verticalAxis * Vector3.up;
        direction.Normalize();
        Vector3 velocity = direction * Time.deltaTime;
        Vector3 displacement = velocity * speed;
        transform.position += displacement;
    }
}