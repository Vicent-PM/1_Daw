using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Seeker : MonoBehaviour
{
    [SerializeField] private Transform target;
    [SerializeField] private float speed;
    [SerializeField] private float rotationSpeed;
    [SerializeField] private int StoppingDistance;
    

    // Update is called once per frame
    void Update()
    {
        float distance = Vector3.Distance(target.position, transform.position);

        if (distance <= StoppingDistance)
            return;

        Vector3 targetDir = (target.position - transform.position);

        targetDir.Normalize();
        Vector3 velocity = transform.forward * speed;
        Vector3 displacement = velocity * Time.deltaTime;
        transform.Translate(displacement, Space.World);

        Quaternion targetOrientation = Quaternion.LookRotation(targetDir, Vector3.up);
        transform.rotation =
            Quaternion.RotateTowards(transform.rotation, targetOrientation, rotationSpeed * Time.deltaTime);
    }
}